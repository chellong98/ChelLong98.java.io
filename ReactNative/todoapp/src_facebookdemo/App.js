 import SplashContainer from './container/splashsreencontainer';
 import LoginContainer from './container/logincontainer';
import {StackNavigator} from 'react-navigation';

 const Stack = StackNavigator({
     SplashContainer : {
         screen: SplashContainer,
     },
     LoginContainer: {
         screen: LoginContainer,
     }
},
{
    initialRouteName: 'SplashContainer',
    headerMode: 'none'
}
);

export default Stack;