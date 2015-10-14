/**
 * 
 */
package pl.grmdev.hitboard.video;

import java.io.*;
import java.net.URL;
/**
 * @author Levvy055
 */
public class VideoDownloader {
	
	public static void saveVideo(String url, String saveLoc, String filename)
			throws Exception {
		new VideoDownloader().save(url, saveLoc, filename);
	}
	
	public void save(String url, String saveLoc, String filename)
			throws Exception {
		String[] cmds = {"cmd", "/c", "livestreamer.exe", url, "best", "-o",
				saveLoc + "/" + filename};
		URL dirUrl = VideoDownloader.class.getClassLoader()
				.getResource("libs/livestreamer");
		File dir = new File(dirUrl.getFile());
		if (!dir.exists() || dir.isFile()) {
			throw new IOException("library 'livestreamer' corrupted");
		}
		try {
			ProcessBuilder pB = new ProcessBuilder(cmds);
			pB.directory(dir);
			final Process p = pB.start();
			final ProcessResultReader stderr = new ProcessResultReader(
					p.getErrorStream(), "STDERR");
			final ProcessResultReader stdout = new ProcessResultReader(
					p.getInputStream(), "STDOUT");
			stderr.start();
			stdout.start();
			final int exitValue = p.waitFor();
			if (exitValue == 0) {
				System.out.print(stdout.toString());
			} else {
				System.err.print(stderr.toString());
			}
		} catch (final IOException e) {
			throw new RuntimeException(e);
		} catch (final InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	
	private class ProcessResultReader extends Thread {
		
		final InputStream is;
		final String type;
		final StringBuilder sb;
		
		ProcessResultReader(final InputStream is, String type) {
			this.is = is;
			this.type = type;
			this.sb = new StringBuilder();
		}
		
		@Override
		public void run() {
			try {
				final InputStreamReader isr = new InputStreamReader(is);
				final BufferedReader br = new BufferedReader(isr);
				String line = null;
				while ((line = br.readLine()) != null) {
					this.sb.append(line).append("\n");
				}
			} catch (final IOException ioe) {
				System.err.println(ioe.getMessage());
				throw new RuntimeException(ioe);
			}
		}
		
		@Override
		public String toString() {
			return this.sb.toString();
		}
	}
}
