import 'package:app_hotel/app/Screens/TelaInicial.dart';
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
        '/': (context) => TelaInicial(),
        //'/home': (context) => HomePage(),
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
