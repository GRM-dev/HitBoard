/**
 * 
 */
package pl.grmdev.hitboard.requests.web;

import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.*;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({"media_chat_enabled", "media_total_views", "media_status",
		"media_deleted", "category_name", "media_featured_countries",
		"media_date_updated", "channel", "category_channels", "media_tags",
		"category_name_short", "media_repair_source", "media_featured_weight",
		"media_featured", "media_hosted_id", "category_media_count", "media_id",
		"media_countries", "media_daily_views", "media_password_protected",
		"media_name", "media_type_id", "media_key", "media_live_delay",
		"media_uploaded", "media_monthly_views", "media_views_daily",
		"media_offline_id", "category_logo_large", "media_yt_upload_status",
		"media_processing", "media_views", "media_download_link",
		"media_profiles", "media_bg_image", "media_mature", "team_name",
		"media_duration_format", "media_date_added", "media_info",
		"media_playing", "media_hidden", "category_seo_key", "media_user_id",
		"media_host", "media_privacy", "media_yt_upload", "media_duration",
		"media_featured_forced", "media_relay", "media_rec_session",
		"media_views_weekly", "media_recording", "media_description_md",
		"category_id", "media_live_notified", "media_dvr",
		"category_logo_small", "media_title", "media_thumbnail_large",
		"media_notify_users", "media_category_id", "media_live_since",
		"media_weekly_views", "media_display_name", "media_ingest_host",
		"user_banned", "media_is_live", "media_file", "category_viewers",
		"media_start_in_sec", "media_description", "category_updated",
		"media_transcoding", "media_views_monthly", "media_user_name",
		"media_thumbnail"})
public class MediaLive {
	
	@JsonProperty("media_chat_enabled")
	private String mediaChatEnabled;
	@JsonProperty("media_total_views")
	private String mediaTotalViews;
	@JsonProperty("media_status")
	private String mediaStatus;
	@JsonProperty("media_deleted")
	private String mediaDeleted;
	@JsonProperty("category_name")
	private String categoryName;
	@JsonProperty("media_featured_countries")
	private String mediaFeaturedCountries;
	@JsonProperty("media_date_updated")
	private String mediaDateUpdated;
	@JsonProperty("channel")
	private ChannelData channelData;
	@JsonProperty("category_channels")
	private String categoryChannels;
	@JsonProperty("media_tags")
	private String mediaTags;
	@JsonProperty("category_name_short")
	private String categoryNameShort;
	@JsonProperty("media_repair_source")
	private String mediaRepairSource;
	@JsonProperty("media_featured_weight")
	private String mediaFeaturedWeight;
	@JsonProperty("media_featured")
	private String mediaFeatured;
	@JsonProperty("media_hosted_id")
	private String mediaHostedId;
	@JsonProperty("category_media_count")
	private String categoryMediaCount;
	@JsonProperty("media_id")
	private String mediaId;
	@JsonProperty("media_countries")
	private String mediaCountries;
	@JsonProperty("media_daily_views")
	private String mediaDailyViews;
	@JsonProperty("media_password_protected")
	private String mediaPasswordProtected;
	@JsonProperty("media_name")
	private String mediaName;
	@JsonProperty("media_type_id")
	private String mediaTypeId;
	@JsonProperty("media_key")
	private String mediaKey;
	@JsonProperty("media_live_delay")
	private String mediaLiveDelay;
	@JsonProperty("media_uploaded")
	private String mediaUploaded;
	@JsonProperty("media_monthly_views")
	private String mediaMonthlyViews;
	@JsonProperty("media_views_daily")
	private String mediaViewsDaily;
	@JsonProperty("media_offline_id")
	private String mediaOfflineId;
	@JsonProperty("category_logo_large")
	private String categoryLogoLarge;
	@JsonProperty("media_yt_upload_status")
	private String mediaYtUploadStatus;
	@JsonProperty("media_processing")
	private String mediaProcessing;
	@JsonProperty("media_views")
	private String mediaViews;
	@JsonProperty("media_download_link")
	private String mediaDownloadLink;
	@JsonProperty("media_profiles")
	private String mediaProfiles;
	@JsonProperty("media_bg_image")
	private String mediaBgImage;
	@JsonProperty("media_mature")
	private String mediaMature;
	@JsonProperty("team_name")
	private String teamName;
	@JsonProperty("media_duration_format")
	private String mediaDurationFormat;
	@JsonProperty("media_date_added")
	private String mediaDateAdded;
	@JsonProperty("media_info")
	private String mediaInfo;
	@JsonProperty("media_playing")
	private String mediaPlaying;
	@JsonProperty("media_hidden")
	private String mediaHidden;
	@JsonProperty("category_seo_key")
	private String categorySeoKey;
	@JsonProperty("media_user_id")
	private String mediaUserId;
	@JsonProperty("media_host")
	private String mediaHost;
	@JsonProperty("media_privacy")
	private String mediaPrivacy;
	@JsonProperty("media_yt_upload")
	private String mediaYtUpload;
	@JsonProperty("media_duration")
	private String mediaDuration;
	@JsonProperty("media_featured_forced")
	private String mediaFeaturedForced;
	@JsonProperty("media_relay")
	private String mediaRelay;
	@JsonProperty("media_rec_session")
	private String mediaRecSession;
	@JsonProperty("media_views_weekly")
	private String mediaViewsWeekly;
	@JsonProperty("media_recording")
	private String mediaRecording;
	@JsonProperty("media_description_md")
	private String mediaDescriptionMd;
	@JsonProperty("category_id")
	private String categoryId;
	@JsonProperty("media_live_notified")
	private String mediaLiveNotified;
	@JsonProperty("media_dvr")
	private String mediaDvr;
	@JsonProperty("category_logo_small")
	private String categoryLogoSmall;
	@JsonProperty("media_title")
	private String mediaTitle;
	@JsonProperty("media_thumbnail_large")
	private String mediaThumbnailLarge;
	@JsonProperty("media_notify_users")
	private String mediaNotifyUsers;
	@JsonProperty("media_category_id")
	private String mediaCategoryId;
	@JsonProperty("media_live_since")
	private String mediaLiveSince;
	@JsonProperty("media_weekly_views")
	private String mediaWeeklyViews;
	@JsonProperty("media_display_name")
	private String mediaDisplayName;
	@JsonProperty("media_ingest_host")
	private String mediaIngestHost;
	@JsonProperty("user_banned")
	private String userBanned;
	@JsonProperty("media_is_live")
	private String mediaIsLive;
	@JsonProperty("media_file")
	private String mediaFile;
	@JsonProperty("category_viewers")
	private String categoryViewers;
	@JsonProperty("media_start_in_sec")
	private String mediaStartInSec;
	@JsonProperty("media_description")
	private String mediaDescription;
	@JsonProperty("category_updated")
	private String categoryUpdated;
	@JsonProperty("media_transcoding")
	private String mediaTranscoding;
	@JsonProperty("media_views_monthly")
	private String mediaViewsMonthly;
	@JsonProperty("media_user_name")
	private String mediaUserName;
	@JsonProperty("media_thumbnail")
	private String mediaThumbnail;
	@JsonIgnore
	private Map<String, String> additionalProperties = new HashMap<String, String>();
	
	/**
	 * No args constructor for use in serialization
	 */
	public MediaLive() {}
	
	/**
	 * @param teamName
	 * @param categoryViewers
	 * @param mediaUploaded
	 * @param mediaViews
	 * @param mediaDuration
	 * @param mediaUserName
	 * @param mediaStatus
	 * @param categoryLogoLarge
	 * @param mediaKey
	 * @param mediaRelay
	 * @param mediaFeaturedCountries
	 * @param categoryName
	 * @param mediaFeaturedWeight
	 * @param mediaViewsWeekly
	 * @param mediaNotifyUsers
	 * @param mediaDescription
	 * @param mediaTypeId
	 * @param mediaThumbnailLarge
	 * @param mediaRepairSource
	 * @param mediaId
	 * @param mediaMonthlyViews
	 * @param categoryId
	 * @param mediaRecSession
	 * @param userBanned
	 * @param mediaName
	 * @param mediaUserId
	 * @param mediaStartInSec
	 * @param mediaPlaying
	 * @param mediaRecording
	 * @param categoryNameShort
	 * @param mediaDownloadLink
	 * @param mediaThumbnail
	 * @param mediaInfo
	 * @param categoryMediaCount
	 * @param mediaCountries
	 * @param mediaDurationFormat
	 * @param categoryLogoSmall
	 * @param mediaTotalViews
	 * @param mediaWeeklyViews
	 * @param mediaFeaturedForced
	 * @param mediaLiveDelay
	 * @param mediaTranscoding
	 * @param mediaDailyViews
	 * @param mediaDateUpdated
	 * @param mediaChatEnabled
	 * @param mediaDisplayName
	 * @param mediaLiveNotified
	 * @param categorySeoKey
	 * @param mediaTitle
	 * @param mediaDescriptionMd
	 * @param mediaLiveSince
	 * @param mediaViewsMonthly
	 * @param mediaCategoryId
	 * @param mediaTags
	 * @param mediaYtUploadStatus
	 * @param mediaMature
	 * @param mediaBgImage
	 * @param categoryChannels
	 * @param mediaDateAdded
	 * @param mediaHost
	 * @param mediaDeleted
	 * @param mediaFeatured
	 * @param mediaViewsDaily
	 * @param mediaFile
	 * @param mediaHidden
	 * @param categoryUpdated
	 * @param mediaHostedId
	 * @param mediaProcessing
	 * @param mediaOfflineId
	 * @param mediaIngestHost
	 * @param mediaYtUpload
	 * @param mediaPrivacy
	 * @param mediaIsLive
	 * @param mediaDvr
	 * @param channelData
	 * @param mediaProfiles
	 * @param mediaPasswordProtected
	 */
	public MediaLive(String mediaChatEnabled, String mediaTotalViews,
			String mediaStatus, String mediaDeleted, String categoryName,
			String mediaFeaturedCountries, String mediaDateUpdated,
			ChannelData channelData, String categoryChannels, String mediaTags,
			String categoryNameShort, String mediaRepairSource,
			String mediaFeaturedWeight, String mediaFeatured,
			String mediaHostedId, String categoryMediaCount, String mediaId,
			String mediaCountries, String mediaDailyViews,
			String mediaPasswordProtected, String mediaName, String mediaTypeId,
			String mediaKey, String mediaLiveDelay, String mediaUploaded,
			String mediaMonthlyViews, String mediaViewsDaily,
			String mediaOfflineId, String categoryLogoLarge,
			String mediaYtUploadStatus, String mediaProcessing,
			String mediaViews, String mediaDownloadLink, String mediaProfiles,
			String mediaBgImage, String mediaMature, String teamName,
			String mediaDurationFormat, String mediaDateAdded, String mediaInfo,
			String mediaPlaying, String mediaHidden, String categorySeoKey,
			String mediaUserId, String mediaHost, String mediaPrivacy,
			String mediaYtUpload, String mediaDuration,
			String mediaFeaturedForced, String mediaRelay,
			String mediaRecSession, String mediaViewsWeekly,
			String mediaRecording, String mediaDescriptionMd, String categoryId,
			String mediaLiveNotified, String mediaDvr, String categoryLogoSmall,
			String mediaTitle, String mediaThumbnailLarge,
			String mediaNotifyUsers, String mediaCategoryId,
			String mediaLiveSince, String mediaWeeklyViews,
			String mediaDisplayName, String mediaIngestHost, String userBanned,
			String mediaIsLive, String mediaFile, String categoryViewers,
			String mediaStartInSec, String mediaDescription,
			String categoryUpdated, String mediaTranscoding,
			String mediaViewsMonthly, String mediaUserName,
			String mediaThumbnail) {
		this.mediaChatEnabled = mediaChatEnabled;
		this.mediaTotalViews = mediaTotalViews;
		this.mediaStatus = mediaStatus;
		this.mediaDeleted = mediaDeleted;
		this.categoryName = categoryName;
		this.mediaFeaturedCountries = mediaFeaturedCountries;
		this.mediaDateUpdated = mediaDateUpdated;
		this.channelData = channelData;
		this.categoryChannels = categoryChannels;
		this.mediaTags = mediaTags;
		this.categoryNameShort = categoryNameShort;
		this.mediaRepairSource = mediaRepairSource;
		this.mediaFeaturedWeight = mediaFeaturedWeight;
		this.mediaFeatured = mediaFeatured;
		this.mediaHostedId = mediaHostedId;
		this.categoryMediaCount = categoryMediaCount;
		this.mediaId = mediaId;
		this.mediaCountries = mediaCountries;
		this.mediaDailyViews = mediaDailyViews;
		this.mediaPasswordProtected = mediaPasswordProtected;
		this.mediaName = mediaName;
		this.mediaTypeId = mediaTypeId;
		this.mediaKey = mediaKey;
		this.mediaLiveDelay = mediaLiveDelay;
		this.mediaUploaded = mediaUploaded;
		this.mediaMonthlyViews = mediaMonthlyViews;
		this.mediaViewsDaily = mediaViewsDaily;
		this.mediaOfflineId = mediaOfflineId;
		this.categoryLogoLarge = categoryLogoLarge;
		this.mediaYtUploadStatus = mediaYtUploadStatus;
		this.mediaProcessing = mediaProcessing;
		this.mediaViews = mediaViews;
		this.mediaDownloadLink = mediaDownloadLink;
		this.mediaProfiles = mediaProfiles;
		this.mediaBgImage = mediaBgImage;
		this.mediaMature = mediaMature;
		this.teamName = teamName;
		this.mediaDurationFormat = mediaDurationFormat;
		this.mediaDateAdded = mediaDateAdded;
		this.mediaInfo = mediaInfo;
		this.mediaPlaying = mediaPlaying;
		this.mediaHidden = mediaHidden;
		this.categorySeoKey = categorySeoKey;
		this.mediaUserId = mediaUserId;
		this.mediaHost = mediaHost;
		this.mediaPrivacy = mediaPrivacy;
		this.mediaYtUpload = mediaYtUpload;
		this.mediaDuration = mediaDuration;
		this.mediaFeaturedForced = mediaFeaturedForced;
		this.mediaRelay = mediaRelay;
		this.mediaRecSession = mediaRecSession;
		this.mediaViewsWeekly = mediaViewsWeekly;
		this.mediaRecording = mediaRecording;
		this.mediaDescriptionMd = mediaDescriptionMd;
		this.categoryId = categoryId;
		this.mediaLiveNotified = mediaLiveNotified;
		this.mediaDvr = mediaDvr;
		this.categoryLogoSmall = categoryLogoSmall;
		this.mediaTitle = mediaTitle;
		this.mediaThumbnailLarge = mediaThumbnailLarge;
		this.mediaNotifyUsers = mediaNotifyUsers;
		this.mediaCategoryId = mediaCategoryId;
		this.mediaLiveSince = mediaLiveSince;
		this.mediaWeeklyViews = mediaWeeklyViews;
		this.mediaDisplayName = mediaDisplayName;
		this.mediaIngestHost = mediaIngestHost;
		this.userBanned = userBanned;
		this.mediaIsLive = mediaIsLive;
		this.mediaFile = mediaFile;
		this.categoryViewers = categoryViewers;
		this.mediaStartInSec = mediaStartInSec;
		this.mediaDescription = mediaDescription;
		this.categoryUpdated = categoryUpdated;
		this.mediaTranscoding = mediaTranscoding;
		this.mediaViewsMonthly = mediaViewsMonthly;
		this.mediaUserName = mediaUserName;
		this.mediaThumbnail = mediaThumbnail;
	}
	
	/**
	 * @return The mediaChatEnabled
	 */
	@JsonProperty("media_chat_enabled")
	public String getMediaChatEnabled() {
		return mediaChatEnabled;
	}
	
	/**
	 * @param mediaChatEnabled
	 *            The media_chat_enabled
	 */
	@JsonProperty("media_chat_enabled")
	public void setMediaChatEnabled(String mediaChatEnabled) {
		this.mediaChatEnabled = mediaChatEnabled;
	}
	
	/**
	 * @return The mediaTotalViews
	 */
	@JsonProperty("media_total_views")
	public String getMediaTotalViews() {
		return mediaTotalViews;
	}
	
	/**
	 * @param mediaTotalViews
	 *            The media_total_views
	 */
	@JsonProperty("media_total_views")
	public void setMediaTotalViews(String mediaTotalViews) {
		this.mediaTotalViews = mediaTotalViews;
	}
	
	/**
	 * @return The mediaStatus
	 */
	@JsonProperty("media_status")
	public String getMediaStatus() {
		return mediaStatus;
	}
	
	/**
	 * @param mediaStatus
	 *            The media_status
	 */
	@JsonProperty("media_status")
	public void setMediaStatus(String mediaStatus) {
		this.mediaStatus = mediaStatus;
	}
	
	/**
	 * @return The mediaDeleted
	 */
	@JsonProperty("media_deleted")
	public String getMediaDeleted() {
		return mediaDeleted;
	}
	
	/**
	 * @param mediaDeleted
	 *            The media_deleted
	 */
	@JsonProperty("media_deleted")
	public void setMediaDeleted(String mediaDeleted) {
		this.mediaDeleted = mediaDeleted;
	}
	
	/**
	 * @return The categoryName
	 */
	@JsonProperty("category_name")
	public String getCategoryName() {
		return categoryName;
	}
	
	/**
	 * @param categoryName
	 *            The category_name
	 */
	@JsonProperty("category_name")
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	/**
	 * @return The mediaFeaturedCountries
	 */
	@JsonProperty("media_featured_countries")
	public String getMediaFeaturedCountries() {
		return mediaFeaturedCountries;
	}
	
	/**
	 * @param mediaFeaturedCountries
	 *            The media_featured_countries
	 */
	@JsonProperty("media_featured_countries")
	public void setMediaFeaturedCountries(String mediaFeaturedCountries) {
		this.mediaFeaturedCountries = mediaFeaturedCountries;
	}
	
	/**
	 * @return The mediaDateUpdated
	 */
	@JsonProperty("media_date_updated")
	public String getMediaDateUpdated() {
		return mediaDateUpdated;
	}
	
	/**
	 * @param mediaDateUpdated
	 *            The media_date_updated
	 */
	@JsonProperty("media_date_updated")
	public void setMediaDateUpdated(String mediaDateUpdated) {
		this.mediaDateUpdated = mediaDateUpdated;
	}
	
	/**
	 * @return The channel
	 */
	@JsonProperty("channel")
	public ChannelData getChannel() {
		return channelData;
	}
	
	/**
	 * @param channel
	 *            The channel
	 */
	@JsonProperty("channel")
	public void setChannel(ChannelData channel) {
		this.channelData = channel;
	}
	
	/**
	 * @return The categoryChannels
	 */
	@JsonProperty("category_channels")
	public String getCategoryChannels() {
		return categoryChannels;
	}
	
	/**
	 * @param categoryChannels
	 *            The category_channels
	 */
	@JsonProperty("category_channels")
	public void setCategoryChannels(String categoryChannels) {
		this.categoryChannels = categoryChannels;
	}
	
	/**
	 * @return The mediaTags
	 */
	@JsonProperty("media_tags")
	public String getMediaTags() {
		return mediaTags;
	}
	
	/**
	 * @param mediaTags
	 *            The media_tags
	 */
	@JsonProperty("media_tags")
	public void setMediaTags(String mediaTags) {
		this.mediaTags = mediaTags;
	}
	
	/**
	 * @return The categoryNameShort
	 */
	@JsonProperty("category_name_short")
	public String getCategoryNameShort() {
		return categoryNameShort;
	}
	
	/**
	 * @param categoryNameShort
	 *            The category_name_short
	 */
	@JsonProperty("category_name_short")
	public void setCategoryNameShort(String categoryNameShort) {
		this.categoryNameShort = categoryNameShort;
	}
	
	/**
	 * @return The mediaRepairSource
	 */
	@JsonProperty("media_repair_source")
	public String getMediaRepairSource() {
		return mediaRepairSource;
	}
	
	/**
	 * @param mediaRepairSource
	 *            The media_repair_source
	 */
	@JsonProperty("media_repair_source")
	public void setMediaRepairSource(String mediaRepairSource) {
		this.mediaRepairSource = mediaRepairSource;
	}
	
	/**
	 * @return The mediaFeaturedWeight
	 */
	@JsonProperty("media_featured_weight")
	public String getMediaFeaturedWeight() {
		return mediaFeaturedWeight;
	}
	
	/**
	 * @param mediaFeaturedWeight
	 *            The media_featured_weight
	 */
	@JsonProperty("media_featured_weight")
	public void setMediaFeaturedWeight(String mediaFeaturedWeight) {
		this.mediaFeaturedWeight = mediaFeaturedWeight;
	}
	
	/**
	 * @return The mediaFeatured
	 */
	@JsonProperty("media_featured")
	public String getMediaFeatured() {
		return mediaFeatured;
	}
	
	/**
	 * @param mediaFeatured
	 *            The media_featured
	 */
	@JsonProperty("media_featured")
	public void setMediaFeatured(String mediaFeatured) {
		this.mediaFeatured = mediaFeatured;
	}
	
	/**
	 * @return The mediaHostedId
	 */
	@JsonProperty("media_hosted_id")
	public String getMediaHostedId() {
		return mediaHostedId;
	}
	
	/**
	 * @param mediaHostedId
	 *            The media_hosted_id
	 */
	@JsonProperty("media_hosted_id")
	public void setMediaHostedId(String mediaHostedId) {
		this.mediaHostedId = mediaHostedId;
	}
	
	/**
	 * @return The categoryMediaCount
	 */
	@JsonProperty("category_media_count")
	public String getCategoryMediaCount() {
		return categoryMediaCount;
	}
	
	/**
	 * @param categoryMediaCount
	 *            The category_media_count
	 */
	@JsonProperty("category_media_count")
	public void setCategoryMediaCount(String categoryMediaCount) {
		this.categoryMediaCount = categoryMediaCount;
	}
	
	/**
	 * @return The mediaId
	 */
	@JsonProperty("media_id")
	public String getMediaId() {
		return mediaId;
	}
	
	/**
	 * @param mediaId
	 *            The media_id
	 */
	@JsonProperty("media_id")
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	
	/**
	 * @return The mediaCountries
	 */
	@JsonProperty("media_countries")
	public String getMediaCountries() {
		return mediaCountries;
	}
	
	/**
	 * @param mediaCountries
	 *            The media_countries
	 */
	@JsonProperty("media_countries")
	public void setMediaCountries(String mediaCountries) {
		this.mediaCountries = mediaCountries;
	}
	
	/**
	 * @return The mediaDailyViews
	 */
	@JsonProperty("media_daily_views")
	public String getMediaDailyViews() {
		return mediaDailyViews;
	}
	
	/**
	 * @param mediaDailyViews
	 *            The media_daily_views
	 */
	@JsonProperty("media_daily_views")
	public void setMediaDailyViews(String mediaDailyViews) {
		this.mediaDailyViews = mediaDailyViews;
	}
	
	/**
	 * @return The mediaPasswordProtected
	 */
	@JsonProperty("media_password_protected")
	public String getMediaPasswordProtected() {
		return mediaPasswordProtected;
	}
	
	/**
	 * @param mediaPasswordProtected
	 *            The media_password_protected
	 */
	@JsonProperty("media_password_protected")
	public void setMediaPasswordProtected(String mediaPasswordProtected) {
		this.mediaPasswordProtected = mediaPasswordProtected;
	}
	
	/**
	 * @return The mediaName
	 */
	@JsonProperty("media_name")
	public String getMediaName() {
		return mediaName;
	}
	
	/**
	 * @param mediaName
	 *            The media_name
	 */
	@JsonProperty("media_name")
	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}
	
	/**
	 * @return The mediaTypeId
	 */
	@JsonProperty("media_type_id")
	public String getMediaTypeId() {
		return mediaTypeId;
	}
	
	/**
	 * @param mediaTypeId
	 *            The media_type_id
	 */
	@JsonProperty("media_type_id")
	public void setMediaTypeId(String mediaTypeId) {
		this.mediaTypeId = mediaTypeId;
	}
	
	/**
	 * @return The mediaKey
	 */
	@JsonProperty("media_key")
	public String getMediaKey() {
		return mediaKey;
	}
	
	/**
	 * @param mediaKey
	 *            The media_key
	 */
	@JsonProperty("media_key")
	public void setMediaKey(String mediaKey) {
		this.mediaKey = mediaKey;
	}
	
	/**
	 * @return The mediaLiveDelay
	 */
	@JsonProperty("media_live_delay")
	public String getMediaLiveDelay() {
		return mediaLiveDelay;
	}
	
	/**
	 * @param mediaLiveDelay
	 *            The media_live_delay
	 */
	@JsonProperty("media_live_delay")
	public void setMediaLiveDelay(String mediaLiveDelay) {
		this.mediaLiveDelay = mediaLiveDelay;
	}
	
	/**
	 * @return The mediaUploaded
	 */
	@JsonProperty("media_uploaded")
	public String getMediaUploaded() {
		return mediaUploaded;
	}
	
	/**
	 * @param mediaUploaded
	 *            The media_uploaded
	 */
	@JsonProperty("media_uploaded")
	public void setMediaUploaded(String mediaUploaded) {
		this.mediaUploaded = mediaUploaded;
	}
	
	/**
	 * @return The mediaMonthlyViews
	 */
	@JsonProperty("media_monthly_views")
	public String getMediaMonthlyViews() {
		return mediaMonthlyViews;
	}
	
	/**
	 * @param mediaMonthlyViews
	 *            The media_monthly_views
	 */
	@JsonProperty("media_monthly_views")
	public void setMediaMonthlyViews(String mediaMonthlyViews) {
		this.mediaMonthlyViews = mediaMonthlyViews;
	}
	
	/**
	 * @return The mediaViewsDaily
	 */
	@JsonProperty("media_views_daily")
	public String getMediaViewsDaily() {
		return mediaViewsDaily;
	}
	
	/**
	 * @param mediaViewsDaily
	 *            The media_views_daily
	 */
	@JsonProperty("media_views_daily")
	public void setMediaViewsDaily(String mediaViewsDaily) {
		this.mediaViewsDaily = mediaViewsDaily;
	}
	
	/**
	 * @return The mediaOfflineId
	 */
	@JsonProperty("media_offline_id")
	public String getMediaOfflineId() {
		return mediaOfflineId;
	}
	
	/**
	 * @param mediaOfflineId
	 *            The media_offline_id
	 */
	@JsonProperty("media_offline_id")
	public void setMediaOfflineId(String mediaOfflineId) {
		this.mediaOfflineId = mediaOfflineId;
	}
	
	/**
	 * @return The categoryLogoLarge
	 */
	@JsonProperty("category_logo_large")
	public String getCategoryLogoLarge() {
		return categoryLogoLarge;
	}
	
	/**
	 * @param categoryLogoLarge
	 *            The category_logo_large
	 */
	@JsonProperty("category_logo_large")
	public void setCategoryLogoLarge(String categoryLogoLarge) {
		this.categoryLogoLarge = categoryLogoLarge;
	}
	
	/**
	 * @return The mediaYtUploadStatus
	 */
	@JsonProperty("media_yt_upload_status")
	public String getMediaYtUploadStatus() {
		return mediaYtUploadStatus;
	}
	
	/**
	 * @param mediaYtUploadStatus
	 *            The media_yt_upload_status
	 */
	@JsonProperty("media_yt_upload_status")
	public void setMediaYtUploadStatus(String mediaYtUploadStatus) {
		this.mediaYtUploadStatus = mediaYtUploadStatus;
	}
	
	/**
	 * @return The mediaProcessing
	 */
	@JsonProperty("media_processing")
	public String getMediaProcessing() {
		return mediaProcessing;
	}
	
	/**
	 * @param mediaProcessing
	 *            The media_processing
	 */
	@JsonProperty("media_processing")
	public void setMediaProcessing(String mediaProcessing) {
		this.mediaProcessing = mediaProcessing;
	}
	
	/**
	 * @return The mediaViews
	 */
	@JsonProperty("media_views")
	public String getMediaViews() {
		return mediaViews;
	}
	
	/**
	 * @param mediaViews
	 *            The media_views
	 */
	@JsonProperty("media_views")
	public void setMediaViews(String mediaViews) {
		this.mediaViews = mediaViews;
	}
	
	/**
	 * @return The mediaDownloadLink
	 */
	@JsonProperty("media_download_link")
	public String getMediaDownloadLink() {
		return mediaDownloadLink;
	}
	
	/**
	 * @param mediaDownloadLink
	 *            The media_download_link
	 */
	@JsonProperty("media_download_link")
	public void setMediaDownloadLink(String mediaDownloadLink) {
		this.mediaDownloadLink = mediaDownloadLink;
	}
	
	/**
	 * @return The mediaProfiles
	 */
	@JsonProperty("media_profiles")
	public String getMediaProfiles() {
		return mediaProfiles;
	}
	
	/**
	 * @param mediaProfiles
	 *            The media_profiles
	 */
	@JsonProperty("media_profiles")
	public void setMediaProfiles(String mediaProfiles) {
		this.mediaProfiles = mediaProfiles;
	}
	
	/**
	 * @return The mediaBgImage
	 */
	@JsonProperty("media_bg_image")
	public String getMediaBgImage() {
		return mediaBgImage;
	}
	
	/**
	 * @param mediaBgImage
	 *            The media_bg_image
	 */
	@JsonProperty("media_bg_image")
	public void setMediaBgImage(String mediaBgImage) {
		this.mediaBgImage = mediaBgImage;
	}
	
	/**
	 * @return The mediaMature
	 */
	@JsonProperty("media_mature")
	public String getMediaMature() {
		return mediaMature;
	}
	
	/**
	 * @param mediaMature
	 *            The media_mature
	 */
	@JsonProperty("media_mature")
	public void setMediaMature(String mediaMature) {
		this.mediaMature = mediaMature;
	}
	
	/**
	 * @return The teamName
	 */
	@JsonProperty("team_name")
	public String getTeamName() {
		return teamName;
	}
	
	/**
	 * @param teamName
	 *            The team_name
	 */
	@JsonProperty("team_name")
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	/**
	 * @return The mediaDurationFormat
	 */
	@JsonProperty("media_duration_format")
	public String getMediaDurationFormat() {
		return mediaDurationFormat;
	}
	
	/**
	 * @param mediaDurationFormat
	 *            The media_duration_format
	 */
	@JsonProperty("media_duration_format")
	public void setMediaDurationFormat(String mediaDurationFormat) {
		this.mediaDurationFormat = mediaDurationFormat;
	}
	
	/**
	 * @return The mediaDateAdded
	 */
	@JsonProperty("media_date_added")
	public String getMediaDateAdded() {
		return mediaDateAdded;
	}
	
	/**
	 * @param mediaDateAdded
	 *            The media_date_added
	 */
	@JsonProperty("media_date_added")
	public void setMediaDateAdded(String mediaDateAdded) {
		this.mediaDateAdded = mediaDateAdded;
	}
	
	/**
	 * @return The mediaInfo
	 */
	@JsonProperty("media_info")
	public String getMediaInfo() {
		return mediaInfo;
	}
	
	/**
	 * @param mediaInfo
	 *            The media_info
	 */
	@JsonProperty("media_info")
	public void setMediaInfo(String mediaInfo) {
		this.mediaInfo = mediaInfo;
	}
	
	/**
	 * @return The mediaPlaying
	 */
	@JsonProperty("media_playing")
	public String getMediaPlaying() {
		return mediaPlaying;
	}
	
	/**
	 * @param mediaPlaying
	 *            The media_playing
	 */
	@JsonProperty("media_playing")
	public void setMediaPlaying(String mediaPlaying) {
		this.mediaPlaying = mediaPlaying;
	}
	
	/**
	 * @return The mediaHidden
	 */
	@JsonProperty("media_hidden")
	public String getMediaHidden() {
		return mediaHidden;
	}
	
	/**
	 * @param mediaHidden
	 *            The media_hidden
	 */
	@JsonProperty("media_hidden")
	public void setMediaHidden(String mediaHidden) {
		this.mediaHidden = mediaHidden;
	}
	
	/**
	 * @return The categorySeoKey
	 */
	@JsonProperty("category_seo_key")
	public String getCategorySeoKey() {
		return categorySeoKey;
	}
	
	/**
	 * @param categorySeoKey
	 *            The category_seo_key
	 */
	@JsonProperty("category_seo_key")
	public void setCategorySeoKey(String categorySeoKey) {
		this.categorySeoKey = categorySeoKey;
	}
	
	/**
	 * @return The mediaUserId
	 */
	@JsonProperty("media_user_id")
	public String getMediaUserId() {
		return mediaUserId;
	}
	
	/**
	 * @param mediaUserId
	 *            The media_user_id
	 */
	@JsonProperty("media_user_id")
	public void setMediaUserId(String mediaUserId) {
		this.mediaUserId = mediaUserId;
	}
	
	/**
	 * @return The mediaHost
	 */
	@JsonProperty("media_host")
	public String getMediaHost() {
		return mediaHost;
	}
	
	/**
	 * @param mediaHost
	 *            The media_host
	 */
	@JsonProperty("media_host")
	public void setMediaHost(String mediaHost) {
		this.mediaHost = mediaHost;
	}
	
	/**
	 * @return The mediaPrivacy
	 */
	@JsonProperty("media_privacy")
	public String getMediaPrivacy() {
		return mediaPrivacy;
	}
	
	/**
	 * @param mediaPrivacy
	 *            The media_privacy
	 */
	@JsonProperty("media_privacy")
	public void setMediaPrivacy(String mediaPrivacy) {
		this.mediaPrivacy = mediaPrivacy;
	}
	
	/**
	 * @return The mediaYtUpload
	 */
	@JsonProperty("media_yt_upload")
	public String getMediaYtUpload() {
		return mediaYtUpload;
	}
	
	/**
	 * @param mediaYtUpload
	 *            The media_yt_upload
	 */
	@JsonProperty("media_yt_upload")
	public void setMediaYtUpload(String mediaYtUpload) {
		this.mediaYtUpload = mediaYtUpload;
	}
	
	/**
	 * @return The mediaDuration
	 */
	@JsonProperty("media_duration")
	public String getMediaDuration() {
		return mediaDuration;
	}
	
	/**
	 * @param mediaDuration
	 *            The media_duration
	 */
	@JsonProperty("media_duration")
	public void setMediaDuration(String mediaDuration) {
		this.mediaDuration = mediaDuration;
	}
	
	/**
	 * @return The mediaFeaturedForced
	 */
	@JsonProperty("media_featured_forced")
	public String getMediaFeaturedForced() {
		return mediaFeaturedForced;
	}
	
	/**
	 * @param mediaFeaturedForced
	 *            The media_featured_forced
	 */
	@JsonProperty("media_featured_forced")
	public void setMediaFeaturedForced(String mediaFeaturedForced) {
		this.mediaFeaturedForced = mediaFeaturedForced;
	}
	
	/**
	 * @return The mediaRelay
	 */
	@JsonProperty("media_relay")
	public String getMediaRelay() {
		return mediaRelay;
	}
	
	/**
	 * @param mediaRelay
	 *            The media_relay
	 */
	@JsonProperty("media_relay")
	public void setMediaRelay(String mediaRelay) {
		this.mediaRelay = mediaRelay;
	}
	
	/**
	 * @return The mediaRecSession
	 */
	@JsonProperty("media_rec_session")
	public String getMediaRecSession() {
		return mediaRecSession;
	}
	
	/**
	 * @param mediaRecSession
	 *            The media_rec_session
	 */
	@JsonProperty("media_rec_session")
	public void setMediaRecSession(String mediaRecSession) {
		this.mediaRecSession = mediaRecSession;
	}
	
	/**
	 * @return The mediaViewsWeekly
	 */
	@JsonProperty("media_views_weekly")
	public String getMediaViewsWeekly() {
		return mediaViewsWeekly;
	}
	
	/**
	 * @param mediaViewsWeekly
	 *            The media_views_weekly
	 */
	@JsonProperty("media_views_weekly")
	public void setMediaViewsWeekly(String mediaViewsWeekly) {
		this.mediaViewsWeekly = mediaViewsWeekly;
	}
	
	/**
	 * @return The mediaRecording
	 */
	@JsonProperty("media_recording")
	public String getMediaRecording() {
		return mediaRecording;
	}
	
	/**
	 * @param mediaRecording
	 *            The media_recording
	 */
	@JsonProperty("media_recording")
	public void setMediaRecording(String mediaRecording) {
		this.mediaRecording = mediaRecording;
	}
	
	/**
	 * @return The mediaDescriptionMd
	 */
	@JsonProperty("media_description_md")
	public String getMediaDescriptionMd() {
		return mediaDescriptionMd;
	}
	
	/**
	 * @param mediaDescriptionMd
	 *            The media_description_md
	 */
	@JsonProperty("media_description_md")
	public void setMediaDescriptionMd(String mediaDescriptionMd) {
		this.mediaDescriptionMd = mediaDescriptionMd;
	}
	
	/**
	 * @return The categoryId
	 */
	@JsonProperty("category_id")
	public String getCategoryId() {
		return categoryId;
	}
	
	/**
	 * @param categoryId
	 *            The category_id
	 */
	@JsonProperty("category_id")
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	/**
	 * @return The mediaLiveNotified
	 */
	@JsonProperty("media_live_notified")
	public String getMediaLiveNotified() {
		return mediaLiveNotified;
	}
	
	/**
	 * @param mediaLiveNotified
	 *            The media_live_notified
	 */
	@JsonProperty("media_live_notified")
	public void setMediaLiveNotified(String mediaLiveNotified) {
		this.mediaLiveNotified = mediaLiveNotified;
	}
	
	/**
	 * @return The mediaDvr
	 */
	@JsonProperty("media_dvr")
	public String getMediaDvr() {
		return mediaDvr;
	}
	
	/**
	 * @param mediaDvr
	 *            The media_dvr
	 */
	@JsonProperty("media_dvr")
	public void setMediaDvr(String mediaDvr) {
		this.mediaDvr = mediaDvr;
	}
	
	/**
	 * @return The categoryLogoSmall
	 */
	@JsonProperty("category_logo_small")
	public String getCategoryLogoSmall() {
		return categoryLogoSmall;
	}
	
	/**
	 * @param categoryLogoSmall
	 *            The category_logo_small
	 */
	@JsonProperty("category_logo_small")
	public void setCategoryLogoSmall(String categoryLogoSmall) {
		this.categoryLogoSmall = categoryLogoSmall;
	}
	
	/**
	 * @return The mediaTitle
	 */
	@JsonProperty("media_title")
	public String getMediaTitle() {
		return mediaTitle;
	}
	
	/**
	 * @param mediaTitle
	 *            The media_title
	 */
	@JsonProperty("media_title")
	public void setMediaTitle(String mediaTitle) {
		this.mediaTitle = mediaTitle;
	}
	
	/**
	 * @return The mediaThumbnailLarge
	 */
	@JsonProperty("media_thumbnail_large")
	public String getMediaThumbnailLarge() {
		return mediaThumbnailLarge;
	}
	
	/**
	 * @param mediaThumbnailLarge
	 *            The media_thumbnail_large
	 */
	@JsonProperty("media_thumbnail_large")
	public void setMediaThumbnailLarge(String mediaThumbnailLarge) {
		this.mediaThumbnailLarge = mediaThumbnailLarge;
	}
	
	/**
	 * @return The mediaNotifyUsers
	 */
	@JsonProperty("media_notify_users")
	public String getMediaNotifyUsers() {
		return mediaNotifyUsers;
	}
	
	/**
	 * @param mediaNotifyUsers
	 *            The media_notify_users
	 */
	@JsonProperty("media_notify_users")
	public void setMediaNotifyUsers(String mediaNotifyUsers) {
		this.mediaNotifyUsers = mediaNotifyUsers;
	}
	
	/**
	 * @return The mediaCategoryId
	 */
	@JsonProperty("media_category_id")
	public String getMediaCategoryId() {
		return mediaCategoryId;
	}
	
	/**
	 * @param mediaCategoryId
	 *            The media_category_id
	 */
	@JsonProperty("media_category_id")
	public void setMediaCategoryId(String mediaCategoryId) {
		this.mediaCategoryId = mediaCategoryId;
	}
	
	/**
	 * @return The mediaLiveSince
	 */
	@JsonProperty("media_live_since")
	public String getMediaLiveSince() {
		return mediaLiveSince;
	}
	
	/**
	 * @param mediaLiveSince
	 *            The media_live_since
	 */
	@JsonProperty("media_live_since")
	public void setMediaLiveSince(String mediaLiveSince) {
		this.mediaLiveSince = mediaLiveSince;
	}
	
	/**
	 * @return The mediaWeeklyViews
	 */
	@JsonProperty("media_weekly_views")
	public String getMediaWeeklyViews() {
		return mediaWeeklyViews;
	}
	
	/**
	 * @param mediaWeeklyViews
	 *            The media_weekly_views
	 */
	@JsonProperty("media_weekly_views")
	public void setMediaWeeklyViews(String mediaWeeklyViews) {
		this.mediaWeeklyViews = mediaWeeklyViews;
	}
	
	/**
	 * @return The mediaDisplayName
	 */
	@JsonProperty("media_display_name")
	public String getMediaDisplayName() {
		return mediaDisplayName;
	}
	
	/**
	 * @param mediaDisplayName
	 *            The media_display_name
	 */
	@JsonProperty("media_display_name")
	public void setMediaDisplayName(String mediaDisplayName) {
		this.mediaDisplayName = mediaDisplayName;
	}
	
	/**
	 * @return The mediaIngestHost
	 */
	@JsonProperty("media_ingest_host")
	public String getMediaIngestHost() {
		return mediaIngestHost;
	}
	
	/**
	 * @param mediaIngestHost
	 *            The media_ingest_host
	 */
	@JsonProperty("media_ingest_host")
	public void setMediaIngestHost(String mediaIngestHost) {
		this.mediaIngestHost = mediaIngestHost;
	}
	
	/**
	 * @return The userBanned
	 */
	@JsonProperty("user_banned")
	public String getUserBanned() {
		return userBanned;
	}
	
	/**
	 * @param userBanned
	 *            The user_banned
	 */
	@JsonProperty("user_banned")
	public void setUserBanned(String userBanned) {
		this.userBanned = userBanned;
	}
	
	/**
	 * @return The mediaIsLive
	 */
	@JsonProperty("media_is_live")
	public String getMediaIsLive() {
		return mediaIsLive;
	}
	
	/**
	 * @param mediaIsLive
	 *            The media_is_live
	 */
	@JsonProperty("media_is_live")
	public void setMediaIsLive(String mediaIsLive) {
		this.mediaIsLive = mediaIsLive;
	}
	
	/**
	 * @return The mediaFile
	 */
	@JsonProperty("media_file")
	public String getMediaFile() {
		return mediaFile;
	}
	
	/**
	 * @param mediaFile
	 *            The media_file
	 */
	@JsonProperty("media_file")
	public void setMediaFile(String mediaFile) {
		this.mediaFile = mediaFile;
	}
	
	/**
	 * @return The categoryViewers
	 */
	@JsonProperty("category_viewers")
	public String getCategoryViewers() {
		return categoryViewers;
	}
	
	/**
	 * @param categoryViewers
	 *            The category_viewers
	 */
	@JsonProperty("category_viewers")
	public void setCategoryViewers(String categoryViewers) {
		this.categoryViewers = categoryViewers;
	}
	
	/**
	 * @return The mediaStartInSec
	 */
	@JsonProperty("media_start_in_sec")
	public String getMediaStartInSec() {
		return mediaStartInSec;
	}
	
	/**
	 * @param mediaStartInSec
	 *            The media_start_in_sec
	 */
	@JsonProperty("media_start_in_sec")
	public void setMediaStartInSec(String mediaStartInSec) {
		this.mediaStartInSec = mediaStartInSec;
	}
	
	/**
	 * @return The mediaDescription
	 */
	@JsonProperty("media_description")
	public String getMediaDescription() {
		return mediaDescription;
	}
	
	/**
	 * @param mediaDescription
	 *            The media_description
	 */
	@JsonProperty("media_description")
	public void setMediaDescription(String mediaDescription) {
		this.mediaDescription = mediaDescription;
	}
	
	/**
	 * @return The categoryUpdated
	 */
	@JsonProperty("category_updated")
	public String getCategoryUpdated() {
		return categoryUpdated;
	}
	
	/**
	 * @param categoryUpdated
	 *            The category_updated
	 */
	@JsonProperty("category_updated")
	public void setCategoryUpdated(String categoryUpdated) {
		this.categoryUpdated = categoryUpdated;
	}
	
	/**
	 * @return The mediaTranscoding
	 */
	@JsonProperty("media_transcoding")
	public String getMediaTranscoding() {
		return mediaTranscoding;
	}
	
	/**
	 * @param mediaTranscoding
	 *            The media_transcoding
	 */
	@JsonProperty("media_transcoding")
	public void setMediaTranscoding(String mediaTranscoding) {
		this.mediaTranscoding = mediaTranscoding;
	}
	
	/**
	 * @return The mediaViewsMonthly
	 */
	@JsonProperty("media_views_monthly")
	public String getMediaViewsMonthly() {
		return mediaViewsMonthly;
	}
	
	/**
	 * @param mediaViewsMonthly
	 *            The media_views_monthly
	 */
	@JsonProperty("media_views_monthly")
	public void setMediaViewsMonthly(String mediaViewsMonthly) {
		this.mediaViewsMonthly = mediaViewsMonthly;
	}
	
	/**
	 * @return The mediaUserName
	 */
	@JsonProperty("media_user_name")
	public String getMediaUserName() {
		return mediaUserName;
	}
	
	/**
	 * @param mediaUserName
	 *            The media_user_name
	 */
	@JsonProperty("media_user_name")
	public void setMediaUserName(String mediaUserName) {
		this.mediaUserName = mediaUserName;
	}
	
	/**
	 * @return The mediaThumbnail
	 */
	@JsonProperty("media_thumbnail")
	public String getMediaThumbnail() {
		return mediaThumbnail;
	}
	
	/**
	 * @param mediaThumbnail
	 *            The media_thumbnail
	 */
	@JsonProperty("media_thumbnail")
	public void setMediaThumbnail(String mediaThumbnail) {
		this.mediaThumbnail = mediaThumbnail;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@JsonAnyGetter
	public Map<String, String> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	@JsonAnySetter
	public void setAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
	}
}