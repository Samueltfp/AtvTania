#include <iostream>

using namespace A;

int fibonacci(int controle) {
    if (controle == 0) {
        return 0;
    } else if (controle == 1) {
        return 1;
    } else {
        return (fibonacci(controle-1) + fibonacci(controle-2));
    }
}

int main(){
    int controle;
    string a;

    cout << "Digite o índice do termo Fibo que você deseja encontrar:-\n";
    cin >> controle;

    cout << "\nThe " << controle << a << "O termo do fibonacci é: " << fibonacci(controle);

    return 0;
}