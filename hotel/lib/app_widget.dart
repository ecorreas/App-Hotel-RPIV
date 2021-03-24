
import 'package:flutter/material.dart';
import 'package:hotel/tela_reservas.dart';


class AppWidget extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(primarySwatch: Colors.brown),
      home: TelaReservas(),
    );
  }
}