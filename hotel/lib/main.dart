import 'package:flutter/material.dart';

void main() => runApp(TelaReservas());

class TelaReservas extends StatelessWidget {
  // This widget is the root of your application.
  String dataIn = '';
  String dataOut = '';
  
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
          title: Text('Buscar Hotéis'),
        ),
        body: Column(
          children: <Widget>[
            Image.asset('assets/imagens/login.jpg'),  
            Padding(
              padding: const EdgeInsets.only(top: 29.0),
            ),
            Text('Data de check-in:'),
            TextField(
              keyboardType: TextInputType.datetime,
              decoration: InputDecoration(
                labelText: 'DD/MM/AAAA',
                border: OutlineInputBorder(),

                ),
            ),
            Padding(
              padding: const EdgeInsets.only(top: 29.0),
            ),
            Text('Data de check-out:'),
            TextField(
              keyboardType: TextInputType.datetime,
              decoration: InputDecoration(
                labelText: 'DD/MM/AAAA',
                border: OutlineInputBorder(),

                ),
            ),
            Padding(
              padding: const EdgeInsets.only(top: 29.0),
            ),
            Text('Cidade:'),
            TextField(
              decoration: InputDecoration(
                labelText: 'Cidade de destino',
                border: OutlineInputBorder(),

                ),
            ),
            Padding(
              padding: const EdgeInsets.only(top: 29.0),
            ),
            RaisedButton(
              child: Text('Logar'),
              onPressed: (){
                Navigator.of(context).push(
                  MaterialPageRoute(builder: (context) => TelaHoteis()),
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

class TelaHoteis extends StatelessWidget{
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
      ),
    );
  }
}