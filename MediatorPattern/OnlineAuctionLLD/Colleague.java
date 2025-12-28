package MediatorPattern.OnlineAuctionLLD;

public interface Colleague {
    void placeBid(int bidAmount);
    void receiveBidNotification(int bidAmount,Colleague bidder);
    String getName();
}
