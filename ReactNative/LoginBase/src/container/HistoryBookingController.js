import React, { Component } from 'react';
import HistoryBooking from './../screens/HistoryBooking';
import BookingService from './../services/BookingService';
import {Alert} from 'react-native';
export interface Props {
  navigation: any,
}
export interface State {}
export default class HistoryBookingController extends Component<Props, State> {
  constructor(props) {
    super(props);
    this.state = {
      list: []
    }
  }

  getRequest() {
    this.service = new BookingService();
    this.service.getAll((result) => {
      this.setState({
        list: result
      }); 
      
    })
  }

  componentDidMount() {
    this.getRequest();  
  }
  render() {
    return (
      <HistoryBooking navigation={this.props.navigation} data={this.state.list}/>
    )
  }
};
