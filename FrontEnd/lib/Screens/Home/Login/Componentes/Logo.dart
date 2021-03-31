import 'package:app_hotel/app/Screens/Home/Components/MyIcons.dart';
import 'package:flutter/material.dart';
import 'package:flutter_svg/flutter_svg.dart';

class Logo extends StatelessWidget {
  const Logo({
    Key key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      margin: const EdgeInsets.only(top: 100),
      child: SvgPicture.asset(
        tela_login,
        width: 100,
        height: 100,
        fit: BoxFit.contain,
        alignment: Alignment.topCenter,
      ),
    );
  }
}
