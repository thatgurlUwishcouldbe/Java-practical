package LabVlll;

public class Email{
    private final String sender;
    private final String receiver;
    private final String subject;
    private double attachmentSize;
    private int attachmentNumber;
    
    private Attachment[] attachments;
    
    public static final double EMAIL_MAX_SIZE = 25.0; // 25 Megabyte
    public static final int EMAIL_MAX_FILES = 50;
    
    public Email(String sender, String receiver, String subject) throws IllegalArgumentException {
        if (goodString(sender))
            this.sender = sender;
        else
            throw new IllegalArgumentException("sender must be good string");
        
        if (goodString(receiver))
            this.receiver = receiver;
        else
            throw new IllegalArgumentException("receiver must be good string");
        
        if (goodString(subject))
            this.subject = subject;
        else
            throw new IllegalArgumentException("subject must be good string");
    }
    
    public void attach(Attachment attachment) throws EAE {
        // attchmentNumber must be less than or equal to EMAIL_MAX_FILES
        if(attachmentNumber > EMAIL_MAX_FILES){
            throw new EAE("attchmentNumber must be less than or equal to EMAIL_MAX_FILES");
        }
        // attachment mustn't be null
        if(attachment==null){
            throw new IllegalArgumentException();
        }
        // attachment.getSize() + attachmentSize must be less than or equal to EMAIL_MAX_SIZE
        if(attachment.getSize() + attachmentSize > EMAIL_MAX_SIZE){
            throw new EAE("attachment.getSize() + attachmentSize must be less than or equal to EMAIL_MAX_SIZE");
        }
        attachments[attachmentNumber] = attachment;
        attachmentNumber++;
        attachmentSize += attachment.getSize();
    }
    
    public static boolean goodString(String str) {
        return (str != null && !str.trim().isEmpty());
    }
}
/*  private final String sender;
    private final String receiver;
    private final String subject;
    private double attachmentSize;
    private int attachmentNumber;
    
    private Attachment[] attachments;
    
    public static final double EMAIL_MAX_SIZE = 25.0; // 25 Megabyte
    public static final int EMAIL_MAX_FILES = 50;
    
    public Email(String sender, String receiver, String subject) {
        if( sender == null || sender.isEmpty()){
            throw new IllegalArgumentException("the sender mustn't be null or empty string");
        }
        if( receiver == null || receiver.isEmpty()){
            throw new IllegalArgumentException("the receiver mustn't be null or empty string");
        }
        if( subject == null || subject.trim().isEmpty()){
            throw new IllegalArgumentException("the subject mustn't be null or empty string");
        }
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }
    
    public void attach(Attachment attachment) {
        attachments[attachmentNumber] = attachment;
        attachmentNumber++;
        attachmentSize += attachment.getSize();
    } 
*/
