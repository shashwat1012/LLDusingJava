package MediatorPattern.OnlineAuctionLLD;

public class Bidder implements Colleague{
    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name,AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount,Colleague bidder) {
        System.out.println(name + " got a notification that " + bidder.getName() + " placed a bid of" + " " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
