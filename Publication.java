class Publication {

    protected  String title;
    final int uni;
    protected  int price;
    float sale[];

    public Publication(){
         uni = 10;
        sale = new float[3];
        title  = "BOOK";
        price = 500;
    }
    public Publication(String title, int uni, int price) {
        this.title = title;
        this.uni = uni;
        this.price = price;
    }
    public  int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public void display(){
        System.out.println("Title : " + title);
        System.out.println("Price : "+ price);
    }

    //
}
