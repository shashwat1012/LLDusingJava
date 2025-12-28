package MediatorPattern.OnlineAuctionLLD;

import java.util.*;

public class Auctioneer implements AuctionMediator{
    
    List<Colleague> bidders = new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder,int bidAmount) {
        for(Colleague Bidder : bidders) {
            if(!Bidder.getName().equals(bidder.getName())) {
                Bidder.receiveBidNotification(bidAmount,bidder);
            }
        }
    }
}
