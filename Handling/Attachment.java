package LabVlll;

public class Attachment
{
    private final String filename;
    private final double size;
    public static final double ATTACHMENT_MAX_SIZE = 10.0; // 10 Megabyte
    
    public Attachment(String filename, double size){
        this.filename = filename;
        if (size <= 10.0)
            this.size = size;
        else
            throw new IllegalArgumentException("attachment size must be less than or equal to " + ATTACHMENT_MAX_SIZE);
    }
    
    public String getFilename(){
        return filename;
    }
    
    public double getSize(){
        return size;
    }
}
  /*private final String filename;
    private final double size;
    public static final double ATTACHMENT_MAX_SIZE = 10.0; // 10 Megabyte
    
    public Attachment(String filename, double size){
        
        //assert filename != null || filename.isEmpty():"Filename cannot be null or empty";
        //assert size > 0 && size <= ATTACHMENT_MAX_SIZE: "ATTACHMENT_MAX_SIZE";
        
        if( filename == null || filename.isEmpty()){
            throw new IllegalArgumentException("the filename mustn't be null or empty string");
        }
        if(size > 0 && size <= ATTACHMENT_MAX_SIZE){
            throw new IllegalArgumentException("the zise must be less or equls ATTACHMENT_MAX_SIZE");  
        }
                
        this.filename = filename;
        this.size = size;
    }
    
    public String getFilename(){
        return filename;
    }
    
    public double getSize(){
        return size;
    }*/
