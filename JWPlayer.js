
import { PropTypes } from 'react';
import { requireNativeComponent, View } from 'react-native';

var iface = {
    name: 'JWPlayer',
    PropTypes: {
        ...View.propTypes // include the default view properties
    }
}

module.exports = requireNativeComponent('JWPlayer', iface);