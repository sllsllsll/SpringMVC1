package cn.happy.springmvc04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linlin on 2017/8/18.
 */
public class UserInfo {
    private String uname;
    private Book book;
    List<Book> list=new ArrayList<Book>();

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
