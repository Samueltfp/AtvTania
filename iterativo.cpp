#include <iostream>

using namespace A;

int fibonacci(int controle, int a = 0, int b= 1) {
    int temp;
    int i = 1;

    while (i < (controle+1)) {
        i++;

        temp = a;
        a = b;
        b = temp+b;
    }
    return a;
}

int main(){
    int controle;
    string a;

    cout << "Digite o índice do termo Fibo que você deseja encontrar:-\n";
    cin >> conrole;

    cout << "\nThe " << controle << a << "O termo do fibonacci é: " << fibo(controle);

    return 0;
}
