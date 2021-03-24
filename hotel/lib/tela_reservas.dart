
import 'package:flutter/material.dart';

class TelaReservas extends StatefulWidget {
  // This widget is the root of your application.
  @override
  State<TelaReservas> createState(){
    return DadosReserva();
  }
}

class DadosReserva extends State<TelaReservas> {
  String dataIn = '';
  String dataOut = '';
  String cidade = '';
  String estado = '';
  @override
  Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(
          title: Text('Buscar Hotéis'),
        ),
        body: SingleChildScrollView( 
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [ 
              Image.asset('assets/imagens/login.jpg'),  
              Container(height: 30,),
              Text('Data de check-in:'),
              TextField(
                keyboardType: TextInputType.datetime,
                decoration: InputDecoration(
                  labelText: 'DD/MM/AAAA',
                  border: OutlineInputBorder(),

                  ),
              ),
              Container(height: 25,),
              Text('Data de check-out:'),
              TextField(
                keyboardType: TextInputType.datetime,
                decoration: InputDecoration(
                  labelText: 'DD/MM/AAAA',
                  border: OutlineInputBorder(),

                  ),
              ),
              Container(height: 25,),
              Text('Cidade:'),
              TextField(
                decoration: InputDecoration(
                  labelText: 'Cidade de destino',
                  border: OutlineInputBorder(),

                  ),
              ),
          
              RaisedButton(
                child: Text('Buscar'),
                onPressed: (){
                  // Navigator.of(context).push(
                  //     MaterialPageRoute(builder: (context) => ()),
                  // );
                },
                color: Colors.green,
                textColor: Colors.white,
              ),
           ],
          ),
        ),
      );
    }
}