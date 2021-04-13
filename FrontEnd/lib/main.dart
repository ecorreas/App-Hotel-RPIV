import 'package:app_hotel/app/Screens/Home/Login/recuperarsenha.dart';
import 'package:app_hotel/app/Screens/homepage.dart';
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
        '/recuperarsenha': (context) => RecuperarSenha(),
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
