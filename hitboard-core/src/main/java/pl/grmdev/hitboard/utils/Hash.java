/**
 * 
 */
package pl.grmdev.hitboard.utils;

import java.security.SecureRandom;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
/**
 * @author Levvy055
 */
public class Hash {
	
	private static final byte[] SALT = {(byte) 0xde, (byte) 0x33, (byte) 0x10,
			(byte) 0x12, (byte) 0xde, (byte) 0x33, (byte) 0x10, (byte) 0x12,};
	private byte[] iv;
	private Cipher c;
	private SecretKey key;
	
	public Hash(byte[] iv) {
		this();
		this.iv = iv;
	}
	
	public Hash() {
		try {
			KeyGenerator kg = KeyGenerator.getInstance("DES");
			SecureRandom r = new SecureRandom(
					"gns6ws4e6sen7".getBytes("Cp1252"));
			kg.init(56, r);
			key = kg.generateKey();
			c = Cipher.getInstance("DES/CBC/PKCS5Padding");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public byte[] encrypt(byte[] str) {
		try {
			c.init(Cipher.ENCRYPT_MODE, key);
			byte encrypted[] = c.doFinal(str);
			iv = c.getIV();
			return encrypted;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public byte[] decrypt(byte[] encrypted) {
		try {
			IvParameterSpec dps = new IvParameterSpec(iv);
			c.init(Cipher.DECRYPT_MODE, key, dps);
			byte output[] = c.doFinal(encrypted);
			return output;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public byte[] getIV() {
		return iv;
	}
	
	public void setIV(byte[] ivB) {
		iv = ivB;
	}
}
