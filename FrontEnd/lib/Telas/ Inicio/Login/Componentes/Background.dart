import 'package:app_hotel/Assets/Icons/MyIcons.dart';
import 'package:flutter/material.dart';
import 'package:flutter_svg/flutter_svg.dart';

class Background extends StatelessWidget {
  final Widget child;
  const Background({
    Key key,
    @required this.child,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    Size size = MediaQuery.of(context).size;
    return Container(
      decoration: BoxDecoration(
          gradient: LinearGradient(
        begin: Alignment.topRight,
        end: Alignment.bottomLeft,
        colors: [
          Colors.blue,
          Color(36464D),
        ],
      )),
      child: Center(
        child: Stack(
          alignment: Alignment.topCenter,
          children: [
            Positioned(
              child: Image.asset(telaLogin),
            ),
          ],
        ),
      ),
    );
  }
}
