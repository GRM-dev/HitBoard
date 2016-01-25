package pl.grmdev.hitboard.requests.web.data;

public interface IUserPrivateData {
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserId()
	 */
	String getUserId();
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserName()
	 */
	String getUserName();
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserLogo()
	 */
	String getUserLogo();
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserLogoSmall()
	 */
	String getUserLogoSmall();
	
	/**
	 * @return The livestreamCount
	 */
	String getLivestreamCount();
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getFollowers()
	 */
	String getFollowers();
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserCover()
	 */
	String getUserCover();
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserStatus()
	 */
	String getUserStatus();
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPublicData#getTwitterAccount()
	 */
	String getTwitterAccount();
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPublicData#getTwitterEnabled()
	 */
	String getTwitterEnabled();
	
	/*
	 * (non-Javadoc)
	 * @see
	 * pl.grmdev.hitboard.requests.web.data.IUserPublicData#getUserBetaProfile()
	 */
	String getUserBetaProfile();
	
	/**
	 * @return
	 * 			The userEmail
	 */
	String getUserEmail();
	
	/**
	 * @return The userPartner
	 */
	String getUserPartner();
	
	/**
	 * @return
	 * 			The partnerType
	 */
	String getPartnerType();
	
	/**
	 * @return
	 * 			The mediaIsLive
	 */
	String getMediaIsLive();
	
	/**
	 * @return
	 * 			The mediaLiveSince
	 */
	String getMediaLiveSince();
	
	/**
	 * @return
	 * 			The userMediaId
	 */
	String getUserMediaId();
	
}