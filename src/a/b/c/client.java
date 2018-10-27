package a.b.c;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;



public class client {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub
       
		
		String url="http://www.baidu.com";
		HttpClient client=new DefaultHttpClient();    //创建Httpclient实例
	    HttpGet request =new HttpGet(url);//确定请求方法，并获取服务器相应
	    HttpResponse response=client.execute(request);
	    int code =response.getStatusLine().getStatusCode();
	    if(code==200)
	    {
	    	  long len=response.getEntity().getContentLength();
	    	   @SuppressWarnings("deprecation")
			String result=EntityUtils.toString(response.getEntity(),HTTP.UTF_8);
	    	   
	    	   System.out.println("len:"+len);
	    	   System.out.println("result:"+result);
	    }
	    
	}

}
