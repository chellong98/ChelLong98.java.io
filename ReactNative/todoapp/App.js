import React from 'react';
import {StackNavigator} from 'react-navigation';
import SplashScreenContainer from './src/containers/splashsreenContainer';

const App = StackNavigator(
  {
    SplashScreenContainer : {
      screen: SplashScreenContainer
    }
  },
  {
    initialRouteName: "SplashScreenContainer",
    headerMode: "none",
  }
)

export default App;