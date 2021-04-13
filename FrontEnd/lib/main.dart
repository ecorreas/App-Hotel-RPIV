import 'package:app_hotel/app/Screens/Home/Login/recuperarSenha.dart';
import 'package:app_hotel/app/Screens/homePage.dart';
import 'package:app_hotel/criarCadastro.dart';
import 'package:flutter/material.dart';

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
