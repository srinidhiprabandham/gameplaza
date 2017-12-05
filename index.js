import { AppRegistry } from 'react-native';
import {NativeModules} from 'react-native';
module.exports = NativeModules.ToastModule;

import App from './App';

AppRegistry.registerComponent('gameplaza', () => App);
