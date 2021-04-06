import * as React from 'react';
import MathUtils from "./utils/MathUtils";

const StarsDisplay = props => (
    <>
        { MathUtils.range(1, props.count).map(starId => (
            <div key={starId} className="star"/>
        ))}
    </>
);

export default StarsDisplay;