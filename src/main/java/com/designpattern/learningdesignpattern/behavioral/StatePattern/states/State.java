package com.designpattern.learningdesignpattern.behavioral.StatePattern.states;

import java.util.List;

import com.designpattern.learningdesignpattern.behavioral.StatePattern.Coin;
import com.designpattern.learningdesignpattern.behavioral.StatePattern.Item;
import com.designpattern.learningdesignpattern.behavioral.StatePattern.VendingMachine;

public interface State {

    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;

    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;

    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;

}
