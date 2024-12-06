package entities;


public class OrdemItem {
 private int quantity;
 private double preco;
  
 

  public int getQuantity() {
  return quantity;
}



public void setQuantity(int quantity) {
  this.quantity = quantity;
}



public double getPreco() {
  return preco;
}



public void setPreco(double preco) {
  this.preco = preco;
}



  public double subTotal(){
     return getQuantity() * getPreco();
  }
}
