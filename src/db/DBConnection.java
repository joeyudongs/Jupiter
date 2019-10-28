package db;

import java.util.List;
import java.util.Set;
import entity.Item;

public interface DBConnection {
	/**
	 * Close the connection
	 */
	public void close();
	
	/**
	 * Insert the favorite items for a user.
	 * @param userId
	 * @param itemIds
	 */
	public void setFavoriteItems(String userId, List<String> itemIds);
	
	/**
	 * Delete the favorite items for a user.
	 * @param: userId
	 * @param: itemIds
	 */
	public void unsetFavoriteItems(String userId, List<String> itemIds);
	
	/**
	 * Get the favorite item id for a user.
	 * @param: userId
	 * @param: itemIds
	 */
	public Set<String> getFavoriteItemIds(String userId);
	
	/**
	 * Get the favorite items for a user.
	 * @param: userId
	 * @param: items
	 */
	public Set<Item> getFavoriteItems(String userId);
	
	/**
	 * Gets categories based on item id
	 * @param itemId
	 * @param set of categories
	 */
	public Set<String> getCategories(String itemId);
	
	/**
	 * Search items near a geolocation and a term(optional).
	 * @param: userId
	 * @param lat
	 * @param lon
	 * @param term
	 * 
	 * @return list of items
	 */
	public List<Item> searchItems(double lat, double lon, String term);
	
	/**
	 * Save item into db.
	 * @param item
	 */
	public void saveItem(Item item);
	
	/**
	 * Get full name of a user.(This is not needed for main course, just for demo and extention).
	 * @param userId
	 * @param full name of the user
	 */
	public String getFullname(String userId);
	
	/**
	 * Return whether the credential is correct. (This is not needed for main course, just for demo and extention).
	 * @param userId
	 * @param password
	 * @param boolean
	 */
	public boolean verifyLogin(String userId, String password);
}


