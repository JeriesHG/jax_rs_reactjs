import React, {PropTypes} from 'react';

export default class MaterialComponent extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
      <div>
      
        <button className="waves-effect waves-light btn" onClick={this.props.onClick}>
          {this.props.children}
        </button>
      </div>
    );
  }
}


/*btn-floating btn-large waves-effect waves-light red
*/