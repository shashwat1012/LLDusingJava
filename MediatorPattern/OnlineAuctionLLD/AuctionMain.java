package MediatorPattern.OnlineAuctionLLD;

public class AuctionMain {

    public static void main(String[] args) {
        AuctionMediator auctioneer = new Auctioneer();
        Colleague bidder1 = new Bidder("bidder1",auctioneer);
        Colleague bidder2 = new Bidder("bidder2",auctioneer);
        bidder1.placeBid(2000);
        bidder2.placeBid(3000);
    }
}
