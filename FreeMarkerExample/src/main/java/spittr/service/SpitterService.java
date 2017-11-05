package spittr.service;


import spittr.entity.Spitter;

/** Spitter的服务接口
 * @author mingqiu
 *
 */
public interface SpitterService {

  /**
   * 保存Spitter
   * @param spitter 待保存的spitter对象
   * @return 保存好的spitter对象
   */
  Spitter save(Spitter spitter);
  
  /**
   * 根据用户名找spitter对象
   * @param username 用户名
   * @return 找到的spitter对象
   */
  Spitter findByUsername(String username);
}