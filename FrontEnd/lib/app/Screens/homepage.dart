import 'package:app_hotel/app/Screens/loginform.dart';
import 'package:app_hotel/app/Screens/Home/Login/Componentes/backgroundimage.dart';
import 'package:app_hotel/app/Screens/Home/Login/Componentes/logo.dart';
import 'package:flutter/material.dart';

class HomePage extends StatefulWidget {
  HomePage({Key key}) : super(key: key);

  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return BackgroundImage(
      child: Scaffold(
        backgroundColor: Colors.transparent,
        body: Padding(
          padding: const EdgeInsets.symmetric(horizontal: 20),
          child: Column(
            children: [
              Logo(),
              LoginForm(),
            ],
          ),
        ),
      ),
    );
  }
}
