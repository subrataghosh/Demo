import java.util.Base64;

public class EncDec {

	public static void main(String[] args) {
		String str="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<!--Generated by Oracle BI Publisher 11.1.1.9.0 -Dataengine, datamodel:_Custom_O2C_Reports_View_Draft_Reports_Billing_Details_Data_Models_CCARBillingDetailsDM_xdm -->\n<DATA_DS><P_CUST_ACCOUNT>F0097-00170</P_CUST_ACCOUNT><P_BILLING_NUMBER>None</P_BILLING_NUMBER>\n<DETAILS>\n<CUSTOMER_TRX_ID>10814</CUSTOMER_TRX_ID><TRANSACTION_NUMBER>9291198</TRANSACTION_NUMBER><TOTAL_AMOUNT>-819.00</TOTAL_AMOUNT><TRANSACTION_DATE>25-Jan-2016</TRANSACTION_DATE><LINE_TYPE>Payment</LINE_TYPE><BASIC_CHARGES>0.00</BASIC_CHARGES><TAX_CHARGES>0.00</TAX_CHARGES><SERVICE_CHARGES>0.00</SERVICE_CHARGES><PARTY_NAME>Travis Farley</PARTY_NAME><STATUS>DRAFT</STATUS><OTHER_CLUB>No</OTHER_CLUB><TYPE>Payment</TYPE>\n";
		
		/*String encoded = Base64.getEncoder().encodeToString(str.getBytes());
		
		byte [] barr = Base64.getDecoder().decode(str); 
		
		  String s = new String(barr);*/
		  
		System.out.println(str.substring(str.indexOf("\n<DETAILS>\n")));

	}

}
