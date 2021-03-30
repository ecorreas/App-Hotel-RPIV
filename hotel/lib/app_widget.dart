
import 'package:flutter/material.dart';
import 'package:hotel/escolha_de_quartos.dart';
import 'package:hotel/hoteis_disponiveis.dart';
import 'package:hotel/tela_reservas.dart';
import 'package:hotel/escolha_de_quartos.dart';


class AppWidget extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(primarySwatch: Colors.blue),
      initialRoute: '/',
      routes: {
        '/': (context) => TelaReservas(),
        '/hoteis': (context) => Hoteis_Disponiveis(),
        '/quartos': (context) => Quartos_livres(),
      }
    );
  }
}