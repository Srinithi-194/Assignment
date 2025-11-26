package com.mph.MavenProject7;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       
//    	Video youtubeHD=new Youtube(new HDProcessing());
//    	youtubeHD.playVideo();
//    	
//    	Video ytk=new Youtube(new FourKProcessing());
//    	ytk.playVideo();
//    	
//    	Video pHD=new Prime(new HDProcessing());
//    	pHD.playVideo();
//    	
//    	Video ptk=new Prime(new FourKProcessing());
//    	ptk.playVideo();
    	
    	
    	Payment netbank=new NetBanking();
    	netbank.pay(50000);
    	System.out.println("*********************");
    	Payment upi=new UPIPayment();
    	upi.pay(70000);
    }
}
