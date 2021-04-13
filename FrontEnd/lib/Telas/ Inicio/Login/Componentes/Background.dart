import 'package:flutter/material.dart';
import 'package:app_hotel/app/Screens/Home/Components/icons.dart';
class Background extends StatelessWidget {
  final Widget child;
  const Background({
    Key key,
    @required this.child,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      decoration: BoxDecoration(
          gradient: LinearGradient(
        begin: Alignment.topRight,
        end: Alignment.bottomLeft,
        colors: [
          Colors.blue,
          Color(0xFF36464D),
        ],
      )),
      child: Center(
        child: Stack(
          alignment: Alignment.topCenter,
          children: [
            Positioned(
              child: Image.asset(tela_login),
            ),
          ],
        ),
      ),
    );
  }
}
