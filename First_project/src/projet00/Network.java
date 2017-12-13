package projet00;

/**
 * The Class Network.
 */
public class Network {
	
	private String ssid, mac ,id , time;
	double lat, lon ,alt;
	
	private int frequncy, signal;
	
	/**
	 * Instantiates a new network.
	 */
	public Network() {
	}
	/**
	 * Instantiates a new network.
	 * @author adiel ,adi and yuda
	 * @param String ssid
	 * @param String n mac
	 * @param Int frequncy
	 * @param Int signal
	 * @param String time
	 * @param String id
	 * @param String lat
	 * @param String lon
	 * @param String alt
	 */
	public Network(String nSsid, String nMac, int nFrequncy, int nSignal, 
			String nTime,String nId, double nLat, double nLon, double nAlt) {
		this.mac = (!nMac.equals(null)) ? nMac: "NaN";
		this.ssid = (!nSsid.equals(null)) ? nSsid:"NaN";
		this.frequncy = (nFrequncy != 0) ? nFrequncy:0;
		this.signal = (nSignal != 0) ? nSignal:0;
		this.time = (!nTime.equals(null)) ? nTime:"NaN";;
		this.id = (!nId.equals(null)) ? nId:"NaN";
		this.lat = (nLat != 0) ? nLat:0;
		this.lon = (nLon != 0) ? nLon:0;
		this.alt = (nAlt != 0) ? nAlt:0;
	}
	/**
	 * Instantiates a new network.
	 * @author adiel ,adi and yuda
	 * @param String n mac
	 * @param Int signal
	 * @param String lat
	 * @param String lon
	 * @param String alt
	 */
	public Network(String nMac, double nLat, double nLon, double nAlt) {
		this.mac = (!nMac.equals(null)) ? nMac: "NaN";
		this.lat = (nLat != 0) ? nLat:0;
		this.lon = (nLon != 0) ? nLon:0;
		this.alt = (nAlt != 0) ? nAlt:0;
	}
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * Gets the time.
	 *
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	
	/**
	 * Gets the lat.
	 *
	 * @return the lat
	 */
	public double getLat() {
		return lat;
	}
	
	/**
	 * Gets the lon.
	 *
	 * @return the lon
	 */
	public double getLon() {
		return lon;
	}
	
	/**
	 * Gets the alt.
	 *
	 * @return the alt
	 */
	public double getAlt() {
		return alt;
	}
	
	/**
	 * Gets the mac.
	 *
	 * @return the mac
	 */
	public String getMac() {
		return mac;
	}

	/**
	 * Gets the ssid.
	 *
	 * @return the ssid
	 */
	public String getSsid() {
		return ssid;
	}

	/**
	 * Gets the frequncy.
	 *
	 * @return the frequncy
	 */
	public int getFrequncy() {
		return frequncy;
	}

	/**
	 * Gets the signal.
	 *
	 * @return the signal
	 */
	public int getSignal() {
		return signal;
	}

}
