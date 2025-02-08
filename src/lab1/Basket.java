package lab1;

public class Basket {
	private int ID;
	private Item items[]=new Item[2];
	private MarketCard card;
	public Basket(int ID) {
		this.ID = ID;
	}
	/*public void addItem(Item item) {
		int i=0;
		while(i<items.length && items[i]!=null) {
			i++;
			if(i>=items.length) {
				System.out.println("Sepet dolu");
			}
			else {
				items[i]=item;
				System.out.println(items[i]+" sepete eklendi");
			}
		}	
	}*/    //KONTROL DÖNGÜ İÇİNDE OLMAZ
    public void addItem(Item item) {
        int i = 0;
        while (i < items.length && items[i] != null) {
            i++;
        }
        if (i >= items.length) {
            System.out.println("Sepet dolu");
        } else {
            items[i] = item;
            System.out.println(items[i] + " sepete eklendi");
        }
    }
	/*
	public void addItem(Item item) {
		int i=0;
		while(i<items.length && items[i]!=null) {
			i++;
		}
		if(items[i]==null) {
			items[i]=item;
			System.out.println(item+"Sepette eklendi");
		}
		else {
			System.out.println("Sepette boş yer yok");
		}	
	}
	*/    //BU NEDEN ÇALIŞMADI ANLAMADIM.
	public void basketInfo(){
		int count=0;
		double fiyat=0;
		for(int j=0;j<items.length;j++) {
			if(items[j]!=null) {
				count++;
				fiyat+=items[j].getPrice();
			}		
		}
		if(card!=null) {
			card.addPoints(fiyat);		
		}
		System.out.println(ID+" numarası "+count+" tane eşya var ve toplam fiyat= "+fiyat);
		System.out.println("Kart puanı= "+card.getPoints());
	}
	public void setCard(MarketCard card) {
		this.card = card;
	}

}
