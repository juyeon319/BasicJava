package chap06.sec01;

public class ProductsEx {

	public static void main(String[] args) {
		Products pd = new Products();
		pd.prodno = "A11034";
		pd.prodname = "휴대용필름OLE";
		pd.prodmaker = "OO회사";
		pd.prodprice = "300만원";
		
		pd.proddata();
	}
}
