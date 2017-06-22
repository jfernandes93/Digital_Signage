/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidade do Minho
 * License Type: Academic
 */
package implementacao;

import org.orm.PersistentException;
public class FeedRSSProcessor {
	private int ID;
	
	private String URL;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setURL(String value) {
		this.URL = value;
	}
	
	public String getURL() {
		return URL == null ? "" : URL;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				implementacao.FeedRSS _feedRSS = implementacao.FeedRSSDAO.loadFeedRSSByORMID(getID());
				if (_feedRSS!= null) {
					copyFromBean(_feedRSS);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				implementacao.FeedRSS _feedRSS = implementacao.FeedRSSDAO.createFeedRSS();
				copyToBean(_feedRSS);
				if (implementacao.FeedRSSDAO.save(_feedRSS)) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				implementacao.FeedRSS _feedRSS= implementacao.FeedRSSDAO.loadFeedRSSByORMID(getID());
				if (_feedRSS != null) {
					copyToBean(_feedRSS);
					if (implementacao.FeedRSSDAO.save(_feedRSS)) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				implementacao.FeedRSS _feedRSS = implementacao.FeedRSSDAO.loadFeedRSSByORMID(getID());
				if (_feedRSS != null && implementacao.FeedRSSDAO.delete(_feedRSS)) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(implementacao.FeedRSS _feedRSS) {
		setURL(_feedRSS.getURL());
		setID(_feedRSS.getORMID());
	}
	
	private void copyToBean(implementacao.FeedRSS _feedRSS) {
		_feedRSS.setURL(getURL());
	}
	
}

