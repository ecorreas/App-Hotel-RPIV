import 'package:flutter/material.dart';

void main() => runApp(Login());

class Login extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Login',
      theme: ThemeData(
        primarySwatch: Colors.brown,
        visualDensity: VisualDensity.adaptivePlatformDensity, 
      ),
      home: Scaffold(
        appBar: AppBar(
          title: Text('Login Hotelaria'),
        ),
        body: Column(
          children: <Widget>[
            Image.asset('assets/imagens/login.jpg'),  
            Padding(
              padding: const EdgeInsets.only(top: 60.0),
            ),
            Text('E-mail:'),
            TextField(),
            Padding(
              padding: const EdgeInsets.only(top: 50.0),
            ),
            Text('Senha:'),
            TextField(),
            Padding(
              padding: const EdgeInsets.only(top: 50.0),
            ),
            RaisedButton(
              child: Text('Logar'),
              onPressed: (){
                Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => TelaReservas()),
            );
              },
              color: Colors.green,
              textColor: Colors.white,
            )
          ],
        ),
      ),
    );
  }
}


class TelaReservas extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Tela de reserva',
      theme: ThemeData(
        primarySwatch: Colors.brown,
        visualDensity: VisualDensity.adaptivePlatformDensity, 
      ),
      home: Scaffold(
        appBar: AppBar(
          title: Text('Hotelaria'),
        ),
        body: Column(
          children: <Widget>[
            Image.asset('assets/imagens/hotelreserva1.jpg'),  
            Padding(
              padding: const EdgeInsets.only(top: 60.0),
            ),
            Text('Data da viagem:'),
            TextField(),
            Padding(
              padding: const EdgeInsets.only(top: 50.0),
            ),
            Text('Local da viagem:'),
            TextField(),
            Padding(
              padding: const EdgeInsets.only(top: 50.0),
            ),
            RaisedButton(
              child: Text('Buscar'),
              onPressed: (){
                 Navigator.pop(context);

              },
              color: Colors.green,
              textColor: Colors.white,
            )
          ],
        ),
      ),
    );
  }
}
