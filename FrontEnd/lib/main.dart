import 'package:app_hotel/app/Screens/Home/Login/recuperarSenha.dart';
import 'package:app_hotel/app/Screens/homePage.dart';
import 'package:app_hotel/criarCadastro.dart';
import 'package:app_hotel/tela_reservas.dart';
import 'package:flutter/material.dart';

import 'escolha_de_quartos.dart';
import 'hoteis_disponiveis.dart';

main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Auth',
      initialRoute: '/',
      routes: {
        '/': (context) => HomePage(),
        '/reservas': (context) => TelaReservas(),
        '/hoteis': (context) => Hoteis_Disponiveis(),
        '/quartos': (context) => Quartos_livres(),
        '/recuperarSenha': (context) => RecuperarSenha(),
        '/criarCadastro': (context) => CriarCadastro(),
      },
      // Scaffold(
      //   body: TelaCadastro(),
      // )
      // Scaffold(
      //   body: TelaCadastro(),
      // )
    );
  }
}
