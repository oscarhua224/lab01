#include <iostream>
using namespace std;
int sumarArreglo(int arr[], int tamano) {
  int suma = 0;
  for (int i = 0; i < tamano; i++) {
      suma+=arr[i];
  }
  return suma;
}
int main() {
  int numeros[]={1,2,3,4,5};
  int tamano=sizeof(numeros)/sizeof(numeros[0]);
  cout<<sumarArreglo(numeros,tamano)<<endl;
  return 0;
}