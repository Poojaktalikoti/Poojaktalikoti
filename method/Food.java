class Food{

static void breakfast(){
System.out.println("haveing breakfast");
}
static void breakfast(String name){
System.out.println("having"+name);
}
static void breakfast(float price){
System.out.println(50);
}

static void breakfast(String name,float price){
System.out.println("having"+name+"price"+price);
}
static void breakfast(String name,int price, String taste){
System.out.println(name + price + taste);
}
static void breakfast(String name,int price,String taste,int quantity){
System.out.println(name+price+taste+quantity);
}
static void breakfast(String name,int price,String taste,int quantity,int noOfPeople){
System.out.println(name+price+taste+quantity+noOfPeople);
}
static int breakfast(String name,int price,int quantity,int total){
int total=price*quantity;
System.out.println(name+" "+price+" "+quantity+" "+total);
return total;
}
Static void main(String[] args){

breakfast();
breakfast("puri");
breakfast(50.f);
breakfast("puri",50.f);
breakfast("puri",50,"tasty");
breakfast("puri",50,"tasty",15);
breakfast("puri",50,"tasty",15,25);
breakfast("puri",50,34);
System.out.println(total);

}
}