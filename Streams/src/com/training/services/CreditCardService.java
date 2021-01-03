package com.training.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.ifaces.DataAccess;
import com.training.model.CreditCard;
import com.training.utils.CreditCardComparator;
import com.training.utils.CreditLimitComparator;

public class CreditCardService implements DataAccess<CreditCard> {
	
	private List<CreditCard> cardList;
	

	public CreditCardService() {
		this.cardList = new ArrayList<>();
	}

	@Override
	public void add(CreditCard ...t) {
		// TODO Auto-generated method stub
		for(CreditCard card:t)
		 this.cardList.add(card);
	}

	@Override
	public CreditCard findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreditCard> findAll() {
		// TODO Auto-generated method stub
		return this.cardList;
		
	}
	
	@Override
	public List<CreditCard> sortedList(String sortBy) {
		// TODO Auto-generated method stub
		switch(sortBy)
		{
		case "cardHolderName" :
		Collections.sort(this.cardList);
		break;
		case "cardNumber" :
			Collections.sort(this.cardList,new CreditCardComparator());
			break;
		case "sortByLimit" :
			Collections.sort(this.cardList,new CreditLimitComparator());
			break;
			default:
				break;
		}
		return this.cardList;
	}


}
