/*program 2 in streams*/

import java.util.ArrayList;

class News
{
    int newsId;
    String postedByUser;
    String commentByUser;
    String comment;

    public News(int newsId, String postedByUser, String commentByUser, String comment)
    {
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }
    public int getNewsId()
    {
        return newsId;
    }
    public void setNewsId(int newsId)
    {
        this.newsId = newsId;
    }
    public String getPostedByUser()
    {
        return postedByUser;
    }
    public void setPostedByUser(String postedByUser)
    {
        this.postedByUser = postedByUser;
    }
    public String getCommentByUser()
    {
        return commentByUser;
    }
    public void setCommentByUser(String commentByUser)
    {
        this.commentByUser = commentByUser;
    }
    public String getComment()
    {
        return comment;
    }
    public void setComment(String comment)
    {
        this.comment = comment;
    }
    @Override
    public String toString() {
        return "News{" +
                "newsId='" + newsId + '\'' +
                ", postedByUser='" + postedByUser + '\'' +
                ", commentByUser='" + commentByUser + '\'' +
                ", comment=" + comment +
                '}';
    }
}
class StrPro2
{
    public static void main(String[] args)
    {
        News s1=(new News(1002,"Rani","Sam","budget"));
        News s2=(new News(1003,"Anu","Siri","Congratulations"));
        News s3=(new News(1004,"Gani","Hanshith","good"));
        News s4=(new News(1005,"Savi","Virat","budget"));
        ArrayList<News> l1=new ArrayList<>();
        {
            l1.add(s1);
            l1.add(s2);
            l1.add(s3);
            l1.add(s4);
            System.out.println(l1);
        }
        long count=  l1.stream().filter(p->p.getComment().equals("budget")).count();
        System.out.println(count);
    }
}


