package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GiftCardTest
{
 @Test
 public void getIssuingStore()
 {
 double balance; 
 GiftCard card;
 int issuingStore;
 
 issuingStore = 1337;
 balance = 100.00;
 card = new GiftCard(issuingStore, balance);
 assertEquals("getIssuingStore()",
 issuingStore, card.getIssuingStore());
}
 
 @Test
 public void getBalance()
 {
 double balance, tolerance; 
 GiftCard card;
 int issuingStore;
 tolerance = 0.001;
 
 issuingStore = 1337;
 balance = 100.00;
 card = new GiftCard(issuingStore, balance);
 assertEquals("getBalance()",
 issuingStore, card.getIssuingStore(),tolerance);
 }
 
 @Test
 public void deduct()
 {
 double balance, deductAmount, expectedAmount;; 
 GiftCard card;
 int issuingStore;
 deductAmount = 1;
 expectedAmount = 99;
 
 issuingStore = 1337;
 balance = 100.00;
 card = new GiftCard(issuingStore, balance);
 card.deduct(deductAmount);
 assertEquals("deduct()",
 String.valueOf(expectedAmount), String.valueOf(card.getBalance()));
}
 
}