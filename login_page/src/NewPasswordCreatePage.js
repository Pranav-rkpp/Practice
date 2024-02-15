import "./css/App.css";
import SideImage from './Layout/SideImage';
import UnlockedPasswordIcon from './image/UnlockedPasswordIcon.png';
import HideIcon from './image/HideIcon.png';
import { FaArrowLeft } from "react-icons/fa";
import { Link } from "react-router-dom";

function NewPasswordCreatePage() {
  return (
    <>
      <h2 className="welcomeText">Welcome back</h2>
      <div className="main">
          <SideImage/>
          <div className='content'>  
              <div className="boxBackground">
              <Link to='/OTPPage' style={{color:'black'}}><FaArrowLeft /></Link>
                  <h2 className="subtitle">Create New Password</h2>
                  <p style={{textAlign:'left'}}>Choosing a hard-to-guess, but easy-to-<br/>remember password is important!</p>
                  <div className="enterNewPassword">
                      <img src={UnlockedPasswordIcon} alt="UnlockedPasswordIcon"/>
                      <input placeholder="Enter your new Password"/>
                      <img src={HideIcon} alt="HideIcon"/>
                  </div>
                  <div className="reconfirmPassword">
                      <img src={UnlockedPasswordIcon} alt="UnlockedPasswordIcon"/>
                      <input placeholder="Re-Enter your password"/>
                      <img src={HideIcon} alt="HideIcon"/>
                  </div>
                  <button>Save</button>
              </div>
          </div>
       </div>
    </>
  );
}

export default NewPasswordCreatePage;