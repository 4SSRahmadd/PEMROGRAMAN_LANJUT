/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package backend;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author rayno
 */
public class Content {

    private int idContent;
    private String quoteTitle, quoteContent;
    private String authorName, authorAddress;

    public Content() {
    }

    public Content(String quoteTitle, String quoteContent, String authorName, String authorAddress) {
        this.quoteTitle = quoteTitle;
        this.quoteContent = quoteContent;
        this.authorName = authorName;
        this.authorAddress = authorAddress;
    }

    public int getIdContent() {
        return idContent;
    }

    public void setIdContent(int idContent) {
        this.idContent = idContent;
    }

    public String getQuoteTitle() {
        return quoteTitle;
    }

    public void setQuoteTitle(String quoteTitle) {
        this.quoteTitle = quoteTitle;
    }

    public String getQuoteContent() {
        return quoteContent;
    }

    public void setQuoteContent(String quoteContent) {
        this.quoteContent = quoteContent;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorAddress() {
        return authorAddress;
    }

    public void setAuthorAddress(String authorAddress) {
        this.authorAddress = authorAddress;
    }

    
    
    public Content getById(int id){
        Content kat = new Content();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM content " + " WHERE quote_id = '"+id+"'");
        
        try{
            while(rs.next()){
                kat = new Content();
                kat.setIdContent(rs.getInt("quote_id"));
                kat.setQuoteTitle(rs.getString("quote_title"));
                kat.setQuoteContent(rs.getString("quote_content"));
                kat.setAuthorName(rs.getString("author_name"));
                kat.setAuthorAddress(rs.getString("author_address"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return kat;
    }
    public ArrayList<Content> getAll(){
        ArrayList<Content> ListContent = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM content");
        
        try{
            while(rs.next()){
                Content kat = new Content();
                kat = new Content();
                kat.setIdContent(rs.getInt("quote_id"));
                kat.setQuoteTitle(rs.getString("quote_title"));
                kat.setQuoteContent(rs.getString("quote_content"));
                kat.setAuthorName(rs.getString("author_name"));
                kat.setAuthorAddress(rs.getString("author_address"));
                ListContent.add(kat);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListContent;
    }
    public ArrayList<Content> search(String keyword){
        ArrayList<Content> ListContent = new ArrayList();
        
        String sql = "SELECT * FROM content WHERE "+" quote_title LIKE '%"+keyword+"%' "+" OR author_name  LIKE '%"+keyword+"%'";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                Content kat = new Content();
                kat = new Content();
                kat.setIdContent(rs.getInt("quote_id"));
                kat.setQuoteTitle(rs.getString("quote_title"));
                kat.setQuoteContent(rs.getString("quote_content"));
                kat.setAuthorName(rs.getString("author_name"));
                kat.setAuthorAddress(rs.getString("author_address"));
                ListContent.add(kat);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListContent;
    }
    public void save(){
        if(getById(idContent).getIdContent()==0){
            String SQL = "INSERT INTO content (quote_title, quote_content, author_name, author_address) VALUES ("+" '"+this.quoteTitle+"', "
                    +" '"+this.quoteContent+"' ,"+" '"+this.authorName+"' ,"+" '"+this.authorAddress+"' "+" )";
            this.idContent = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE content SET "+" quote_title = '"+this.quoteTitle+"', "
            +" quote_content = '"+this.quoteContent+"', "+" author_name = '"
            +this.authorName+"', "+"author_address = '"+this.authorAddress+"' "
            +" WHERE quote_id = '"+this.idContent+"'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQL = "DELETE FROM content WHERE quote_id = '"+this.idContent + "'";
        DBHelper.executeQuery(SQL);
    }
}
