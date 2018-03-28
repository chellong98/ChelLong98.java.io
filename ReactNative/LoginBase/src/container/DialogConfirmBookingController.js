import React, {Component} from 'react';
import DialogConfirmBooking from './../screens/DialogConfirmBooking';

export interface Props {}
export default class DialogConfirmBookingControl extends Component<Props> {
    constructor(props) {
        super(props);
    }
    render() {
        return <DialogConfirmBooking/>
    }
}