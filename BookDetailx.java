package sample;

import java.util.Scanner;
 class Book{
	private int bookNo;

	private String title;
	private String author;
	private float price;
	private static int bookCount;

	static
	{
		bookCount=0;
	}
	Book()
	{
		bookCount++;
	}
	Book(int bNo,String btitle,String bauthor,float bprice)
	{
		if(btitle.length()>=4)
		{

			this.title=btitle;

		}
		else
		{
			System.out.println("title is invalid");

		}
		this.bookNo=bNo;
		this.author=bauthor;
		if(bprice>=1 && bprice<=5000)
		{
			this.price=bprice;
		}
		else
		{
			System.out.println("price is invalid");
		}
		bookCount++;
	}
	public static int getBookCount()
	{
		return bookCount;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int No) {
		this.bookNo = No;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
//	

	@Override
	public String toString() {
		return "bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", price=" + price ;
	}

}
class BookDetailx
{
	public static void main(String[] args) {
		//Book b1=new Book();
		Scanner sc=new Scanner(System.in);
		Book [] bookList=new Book[10];
		for(int i=0;i<3;i++)
		{
			System.out.println("enter book no:");
			int bNo=sc.nextInt();
			sc.nextLine();
		//	b1.setBookNo(bNo);

			System.out.println("enter book title:");
			String bTitle=sc.nextLine();
		//	b1.setTitle();

			System.out.println("enter book author:");
			String bAuthor=sc.nextLine();
		//	b1.setAuthor();

			System.out.println("enter book price:");
			float bPrice=sc.nextFloat();
		//	b1.setPrice();
			Book b2=new Book(bNo, bTitle, bAuthor, bPrice);
			//Book b2=new Book();
			bookList[i]=b2;
		}
		System.out.println("Book count is:"+Book.getBookCount());
        sc.close();

	}


	

}