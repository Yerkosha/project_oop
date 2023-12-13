package Packages;
import java.util.*;


/**
* @generated
*/
public class ResearchJournal {
	
	public ResearchJournal() {}
	
	public ResearchJournal(String journalName) {
		this.journalName = journalName;
	}
	
	public ResearchJournal(String journalName, String journalSection) {
		this.journalName = journalName;
		this.journalSection = journalSection;
	}
    
    /**
    * @generated
    */
    private String journalName;
    
    /**
    * @generated
    */
    private Vector<Researcher> editors;
    
    /**
    * @generated
    */
    private String journalSection;
    
    /**
    * @generated
    */
    private Vector<ResearchPaper> publishedPapers;
    
    /**
    * @generated
    */
    private Set<User> subscribers;
    
    
    /**
    * @generated
    */
    private Vector<ResearchPaper> researchPapers;
    
    /**
    * @generated
    */
    private Double journalRateSum = 0.0;
    
    /**
    * @generated
    */
    private Integer journalRateCounter = 0;
    
    
    /**
    * @generated
    */
    public String getJournalName() {
        return this.journalName;
    }
    
    /**
    * @generated
    */
    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }
    
    /**
    * @generated
    */
    public Vector<Researcher> getEditors() {
        return this.editors;
    }
    
    /**
    * @generated
    */
    public void setEditors(Vector<Researcher> editors) {
        this.editors = editors;
    }
    
    /**
    * @generated
    */
    public String getJournalSection() {
        return this.journalSection;
    }
    
    /**
    * @generated
    */
    public void setJournalSection(String journalSection) {
        this.journalSection = journalSection;
    }
    
    /**
    * @generated
    */
    public Double getJournalRate() {
        return journalRateSum / journalRateCounter;
    }
    
    /**
    * @generated
    */
    public Vector<ResearchPaper> getPublishedPapers() {
        return this.publishedPapers;
    }
    
    /**
    * @generated
    */
    public void setPublishedPapers(Vector<ResearchPaper> publishedPapers) {
        this.publishedPapers = publishedPapers;
    }
    
    /**
    * @generated
    */
    public Set<User> getSubscribers() {
        return this.subscribers;
    }
    
    /**
    * @generated
    */
    public void setSubscribers(Set<User> subscribers) {
        this.subscribers = subscribers;
    }
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public void submitPaper(ResearchPaper paper) {
        this.researchPapers.add(paper);
    }
    
    /**
    * @generated
    */
    public void rateJournal1to10(Integer rate) {
        this.journalRateCounter++;
        this.journalRateSum += rate;
    }
    
    /**
    * @generated
    */
    public void subscribe(User user) {
        this.subscribers.add(user);
    }
    
    /**
    * @generated
    */
    public void unsubscribe(User user) {
        this.subscribers.remove(user);
    }
    
    
}
